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

package co.edu.uniandes.csw.ejemplo.carrito.master.logic.dto;

import co.edu.uniandes.csw.ejemplo.item.logic.dto.ItemDTO;
import co.edu.uniandes.csw.ejemplo.carrito.logic.dto.CarritoDTO;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public abstract class _CarritoMasterDTO {

 
    protected CarritoDTO carritoEntity;
    protected Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public CarritoDTO getCarritoEntity() {
        return carritoEntity;
    }

    public void setCarritoEntity(CarritoDTO carritoEntity) {
        this.carritoEntity = carritoEntity;
    }
    
    public List<ItemDTO> createitem;
    public List<ItemDTO> updateitem;
    public List<ItemDTO> deleteitem;
    public List<ItemDTO> listitem;	
	
	
	
    public List<ItemDTO> getCreateitem(){ return createitem; };
    public void setCreateitem(List<ItemDTO> createitem){ this.createitem=createitem; };
    public List<ItemDTO> getUpdateitem(){ return updateitem; };
    public void setUpdateitem(List<ItemDTO> updateitem){ this.updateitem=updateitem; };
    public List<ItemDTO> getDeleteitem(){ return deleteitem; };
    public void setDeleteitem(List<ItemDTO> deleteitem){ this.deleteitem=deleteitem; };
    public List<ItemDTO> getListitem(){ return listitem; };
    public void setListitem(List<ItemDTO> listitem){ this.listitem=listitem; };	
	
	
}

