/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nerv.managemenBean;

import com.nerv.entity.City;
import com.nerv.facade.CityFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Santos
 */
@ManagedBean
@ViewScoped
public class MbCity implements Serializable{
    
    @EJB
    private CityFacade eJBServicioCity;
    
    City selectedCity;
    List<City> citys;
       
    public MbCity() {
    }

    @PostConstruct
    public void init(){
        setCitys(eJBServicioCity.getCitys());
    }

    //Métodos Set y Get
    
    public City getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(City selectedCity) {
        this.selectedCity = selectedCity;
    }
    
    public List<City> getCitys() {
        return citys;
    }

    public void setCitys(List<City> citys) {
        this.citys = citys;
    }
}
