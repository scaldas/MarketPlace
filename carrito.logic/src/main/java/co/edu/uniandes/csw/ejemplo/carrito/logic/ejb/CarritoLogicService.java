    /* ========================================================================
   * Copyright 2014 ejemplo
   *
   * Licensed under the MIT, The MIT License (MIT)
   * Copyright (c) 2014 ejemplo
  
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:
  
  The above copyright notice and this permission notice shall be included in
  all copies or substantial portions of the Software.
  
  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
  THE SOFTWARE.
   * ========================================================================
  
  
  Source generated by CrudMaker version 1.0.0.201410152247*/

package co.edu.uniandes.csw.ejemplo.carrito.logic.ejb;

import co.edu.uniandes.csw.ejemplo.carrito.logic.api.ICarritoLogicService;
import co.edu.uniandes.csw.ejemplo.carrito.logic.dto.CarritoDTO;
import co.edu.uniandes.csw.ejemplo.carrito.logic.dto.CarritoPageDTO;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless; 
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.ws.rs.core.MediaType;


@Default
@Stateless
@LocalBean
public class CarritoLogicService extends _CarritoLogicService implements ICarritoLogicService {

    public static String URL_SERVICIO = "http://localhost:8080/carrito.web";
    
    public CarritoPageDTO getCarritoCliente(String name, Integer page, Integer maxRecords) {
         try 
         {
            Client client = Client.create();
            /**
             * SE CONSUME EL NUEVO SERVICIO DEL CLIENTE (del componente cliente) PARA OBTENER EL ID DEL CLIENTE.
             */
            WebResource webResource = client.resource(URL_SERVICIO + "/webresources/Client/services/" + name);
            String resp = webResource.type(MediaType.APPLICATION_JSON).accept(MediaType.TEXT_PLAIN).get(String.class);
         //Finalmente, se consulta por el id del cliente.
            return persistance.getCarritoCliente(Long.parseLong(resp), page, maxRecords);
            //Long.parseLong(resp), Integer page, Integer maxRecords);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}