package com.ibm.Demo;

import java.nio.file.Path;
import java.util.List;

import com.ibm.Demo.service.impl.PathValidatorImpl;

public class App {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PathValidatorImpl pathValidator = new PathValidatorImpl();

	        String zipFilePathStr ="C:\\Users\\Swarna\\Downloads\\new2";
	        
	        

	        try {
	            Path zipFilePath = pathValidator.validateAndReturnAbsolutePath(zipFilePathStr);
	            
				
				  List< String> projectName = pathValidator.findProjectFolders(zipFilePath); if
				  (projectName != null) { System.out.println("Project found: " + projectName);
				  } else { System.out.println("No project folder found."); }
				 
	            
	            String val = pathValidator.findRecipe("cloud-application-transformation", zipFilePath);
	            System.out.println("val==>"+val);

				/*
				 * Path unzippedPath = pathValidator.unzip(zipFilePath);
				 * System.out.println("Unzipped to: " + unzippedPath); boolean val =
				 * pathValidator.isMavenProject(unzippedPath);
				 * System.out.println("value ="+val);
				 */
	            		

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}

