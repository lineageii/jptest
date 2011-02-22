package com.sitepk.service;

import java.util.List;

import com.sitepk.hibernate.SpSite;

public interface SiteService {
	/**
	 * get all sites by url
	 * @param url google.com
	 * @return baidu.com,yahoo.com,bing.com.etc
	 */
	public List<SpSite> getSitesByUrl(String url);
	
	/**
	 * get site by id
	 * @param id
	 * @return site
	 */
	public SpSite getSitesById(String id);
}
