package com.ibm.Demo.service;
/*
public interface PathResolver {
	
	String isValidPath(String path);

	String unzipIfZip(String zipFilePath);
	
	boolean isMavenProject(String directoryPath);
}*/


import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.List;

public interface PathValidator {
	
    Path validateAndReturnAbsolutePath(String inputPath) throws InvalidPathException;
    
   // Path unzip(Path zipFilePath) throws IOException;
    
    boolean isMavenProject(Path directoryPath);
    public List<String> findProjectFolders(Path directoryPath) ;

	boolean isSpringBootProject(String projectName, Path directoryPath) throws IOException;

	String findRecipe(String projectName, Path directoryPath) throws IOException;
}
