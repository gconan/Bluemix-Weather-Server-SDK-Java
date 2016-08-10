package weather.server.sdk.v1.forecast;

public interface Forecast {
	
	public ForecastMetadata getMetadata();
	public String getForecastClass();
	public long getExpireTimeGMT();
	public long fcstValid();
	public long forecastValidLocal();

}
