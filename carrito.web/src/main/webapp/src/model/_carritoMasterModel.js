define([], function() {
    App.Model._CarritoMasterModel = Backbone.Model.extend({
     	initialize: function() {
            this.on('invalid', function(model,error) {
                Backbone.trigger('carrito-master-model-error', error);
            });
        },
        validate: function(attrs, options){
        	var modelMaster = new App.Model.CarritoModel();
        	if(modelMaster.validate){
            	return modelMaster.validate(attrs.carritoEntity,options);
            }
        }
    });

    App.Model._CarritoMasterList = Backbone.Collection.extend({
        model: App.Model._CarritoMasterModel,
        initialize: function() {
        }

    });
    return App.Model._CarritoMasterModel;
    
});