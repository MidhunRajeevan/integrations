package eip.integrations.agency.model;

import eip.integrations.shared.model.LanguageMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class EnArNameType {

	private LanguageMapper title;
	private LanguageMapper full;
	private LanguageMapper first;
	private LanguageMapper second;
	private LanguageMapper third;
	private LanguageMapper fourth;
	private LanguageMapper middleName;
	private LanguageMapper familyName;
	private LanguageMapper clanName;
	private LanguageMapper Suffix;
}
