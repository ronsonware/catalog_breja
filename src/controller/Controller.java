package controller;

import model.BrejaPojo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.BrejaService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static sun.plugin.services.PlatformService.getService;

/**
 * Created by robsonrodrigues on 21/06/17.
 */


public abstract class Controller <T extends BrejaPojo<Long>, Long extends Serializable> {

    private BrejaService brejaInstance;

    @RequestMapping(value = "/brejas/", method = RequestMethod.GET)
    public List<T> listBrejas() {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/breja/", method = RequestMethod.POST)
    public HttpStatus insertBreja(T entity) {
        return HttpStatus.OK;
    }

    @RequestMapping(value = "/breja/{id}", method = RequestMethod.PUT)
    public HttpStatus updateBreja(@PathVariable Long id, T entity) {
        return HttpStatus.OK; // Implementar lógica de persistir cervejas
    }

    @RequestMapping(value = "/breja/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteBreja(@PathVariable Long id) {
        return HttpStatus.OK;
    }

    @RequestMapping(value = "/breja/caracteristicas", method = RequestMethod.GET)
    public List<T> brejaCaracteristics() {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/breja/{id}/caracteristica", method = RequestMethod.POST)
    public HttpStatus insertBrejaCaracteristic(T entity) {
        return HttpStatus.OK;
    }

    @RequestMapping(value = "/breja/{id}/caracteristica/{id_caracteristic}", method = RequestMethod.PUT)
    public HttpStatus updateBrejaCaracteristic(@PathVariable Long id, Long id_caracteristic, T entity) {
        return HttpStatus.OK; // Implementar lógica de persistir cervejas
    }

    @RequestMapping(value = "/breja/{id}/caracteristica/{id_caracteristic}", method = RequestMethod.DELETE)
    public HttpStatus deleteBrejaCaracteristic(@PathVariable Long id, Long id_caracteristic) {
        return HttpStatus.OK;
    }

}