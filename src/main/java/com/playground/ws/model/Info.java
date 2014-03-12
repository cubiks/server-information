package com.playground.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Info {

	private String hostname;
	private String platform;
	private String arch;
	private String release;
	private String type;
	private long uptime;
	private long loadavg;
	private long totalmem;
	private long freemem;
	private int cpus;

	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getArch() {
		return arch;
	}
	public void setArch(String arch) {
		this.arch = arch;
	}
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getUptime() {
		return uptime;
	}
	public void setUptime(long uptime) {
		this.uptime = uptime;
	}
	public long getLoadavg() {
		return loadavg;
	}
	public void setLoadavg(long loadavg) {
		this.loadavg = loadavg;
	}
	public long getTotalmem() {
		return totalmem;
	}
	public void setTotalmem(long totalmem) {
		this.totalmem = totalmem;
	}
	public long getFreemem() {
		return freemem;
	}
	public void setFreemem(long freemem) {
		this.freemem = freemem;
	}
	public int getCpus() {
		return cpus;
	}
	public void setCpus(int cpus) {
		this.cpus = cpus;
	}
}
