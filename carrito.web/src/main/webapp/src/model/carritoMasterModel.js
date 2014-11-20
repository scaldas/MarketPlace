define(['model/_carritoMasterModel'], function() { 
    App.Model.CarritoMasterModel = App.Model._CarritoMasterModel.extend({

    });

    App.Model.CarritoMasterList = App.Model._CarritoMasterList.extend({
        model: App.Model.CarritoMasterModel
    });

    return  App.Model.CarritoMasterModel;

});