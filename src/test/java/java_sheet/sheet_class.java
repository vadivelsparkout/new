package java_sheet;

import java.util.Collections;
import java.util.List;

import com.google.api.client.json.JsonFactory;
import com.google.api.services.sheets.v4.SheetsScopes;

public class sheet_class {

	private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
	  private static final JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
	  private static final String TOKENS_DIRECTORY_PATH = "tokens";

	  private static final List<String> SCOPES =
		      Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
		  private static final String CREDENTIALS_FILE_PATH = "selenium.json";
		  
	   }


