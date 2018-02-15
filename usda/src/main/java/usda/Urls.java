package usda;

public interface Urls {
	/** 
	 * Todas as URLs possívels já vem com o formato JSON definido
	 */
	
	String foodReportUrl = "https://api.nal.usda.gov/ndb/reports/";
	String listsUrl = "https://api.nal.usda.gov/ndb/list?format=json&";
	String nutrientReportUrl = "http://api.nal.usda.gov/ndb/nutrients/?format=json&";
	String searchUrl = "https://api.nal.usda.gov/ndb/search/?format=json&";
}
