package eip.integrations.configuration;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Aspect
@Component
public class AspectLogger {
    private static final Logger LOG = LogManager.getLogger(AspectLogger.class);
    
    @Pointcut("execution(* eip.integrations..*(..))")
	public void forAllMethods() {
	}

    @Pointcut("!within(eip.integrations..*..*configuration)")
    public void exceptConfig() {
	}

    @Pointcut("!within(eip.integrations..*..*home)")
	public void exceptHome() {
	}

	@Pointcut("!within(eip.integrations..*..*model)")
	public void exceptBeans() {
	}

    @Before("forAllMethods() && exceptConfig() && exceptBeans() && exceptHome()")
    public void logRequestBody(JoinPoint thisJoinpoint) {
        LOG.info("Before  ::"+ thisJoinpoint.getSignature().getName() + " : :" + thisJoinpoint.getTarget());
        MethodSignature methodSignature=(MethodSignature)thisJoinpoint.getSignature();
        Annotation[][] annotationsmatrix=methodSignature.getMethod().getParameterAnnotations();
        if(annotationsmatrix.length>1)
        {
            int index=-1;
            for(Annotation[] annotations : annotationsmatrix)
            {
                index++;
			for (@SuppressWarnings("unused") Annotation annotation : annotations) {				
				Object requestBody = thisJoinpoint.getArgs()[index];
				LOG.info(thisJoinpoint);
				LOG.info("Request body = " + requestBody);
			}
            }
        }
    }

    @AfterThrowing(pointcut = "forAllMethods()", throwing = "e")
	public void afterThrowAdvice(JoinPoint joinPoint, Throwable e) {
		LOG.info("After Throwing  :: " + joinPoint.getSignature().getName() + "  ::::  " + e.getMessage());
	}

	@After("forAllMethods() && exceptConfig() && exceptBeans() && exceptHome()")
	public void afterAdvice(JoinPoint joinPoint) {
		LOG.info("After  :: " + joinPoint.getSignature().getName() + "  :::: " + joinPoint.getTarget());
	}

	@Around("forAllMethods() && exceptConfig() && exceptBeans() && exceptHome()")
	public Object aroundAdvice(ProceedingJoinPoint pJoinPoint) throws Throwable {
		Object result = null;
		try {
			result = pJoinPoint.proceed();
			LOG.info("Around Advice ::: " + result);
		}		
		finally {

		}

		return result;

	}
}
