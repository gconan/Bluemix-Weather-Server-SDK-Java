package weather.server.sdk.v1.forecast;

public interface Forecast {
	
	public ForecastMetadata getMetadata();
	public String getDate();//fcst_valid_local
	public double getWindSpeed();
	public double getWindDirectionDegrees();//degrees offset of N 24 int?
	public String getWindDirectionCardinal();//cardnal Direction "NNE"
}
