var WeatherStationView = function(){
	this.model = new WeatherStationViewModel(this);
	this.controller = new WeatherStationViewController(this, this.model);
	
	var view = this;
	$('#cities').change(function(){view.controller.onChangeCity.call(view, $(this).val())});
}  

