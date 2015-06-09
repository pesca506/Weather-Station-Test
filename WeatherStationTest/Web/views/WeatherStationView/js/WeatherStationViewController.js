var WeatherStationViewController = function(view, model){
	this.view = view;
	this.model = model;
	
	this.onChangeCity = function(name){
		this.model.consultCityWeather.call(this.model, name);
	}
}  