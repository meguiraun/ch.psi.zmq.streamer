/**
 * 
 * Copyright 2013 Paul Scherrer Institute. All rights reserved.
 * 
 * This code is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This code is distributed in the hope that it will be useful, but without any
 * warranty; without even the implied warranty of merchantability or fitness for
 * a particular purpose. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this code. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package ch.psi.zmq.streamer.model;

/**
 * 
 */
public class StreamSource {
	private String searchPath = "/";
	private String searchPattern = "glob:*";
	
	private String destinationPath = "";
	private int numberOfImages = 0;
	
	public boolean streamExistingFiles = false;
	
	public String getSearchPath() {
		return searchPath;
	}
	public void setSearchPath(String searchPath) {
		this.searchPath = searchPath;
	}
	public String getSearchPattern() {
		return searchPattern;
	}
	public void setSearchPattern(String searchPattern) {
		this.searchPattern = searchPattern;
	}
	public String getDestinationPath() {
		return destinationPath;
	}
	public void setDestinationPath(String destinationPath) {
		this.destinationPath = destinationPath;
	}
	public int getNumberOfImages() {
		return numberOfImages;
	}
	public void setNumberOfImages(int numberOfImages) {
		this.numberOfImages = numberOfImages;
	}
	public boolean isStreamExistingFiles() {
		return streamExistingFiles;
	}
	public void setStreamExistingFiles(boolean streamExistingFiles) {
		this.streamExistingFiles = streamExistingFiles;
	}
}
