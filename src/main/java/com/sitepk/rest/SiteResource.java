package com.sitepk.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sitepk.hibernate.SpSite;
import com.sitepk.service.SiteService;
import com.sun.jersey.api.NotFoundException;

/**
 * Site 相关类
 * 1. /site/google.com 查询和cackle相关的网站
 * @author hujiag@gmail.com
 *
 */
@Path("/site")
@Component
public class SiteResource {
	
	@Autowired
	SiteService siteService;
	
	@Path("/{url}")
	@GET
	@Produces("application/json")
	@SuppressWarnings("unchecked")
	public SpSite[] getSitesByUrl(@PathParam("url") String url) {
		return (SpSite[]) siteService.getSitesByUrl(url).toArray(new SpSite[]{});
	}
	
	@Path("/id/{id}")
	@GET
	@Produces("application/json")
	@SuppressWarnings("unchecked")
	public SpSite getSiteByUrl(@PathParam("id") String id) {
		if(null == siteService.getSitesById(id)){
			throw new NotFoundException();
		}
		return siteService.getSitesById(id);
	}
}
