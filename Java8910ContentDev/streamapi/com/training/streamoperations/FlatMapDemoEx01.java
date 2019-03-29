package com.training.streamoperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Naveen
 * @see This proggram is to show working of flatmap, where the data is passed as a stream of projects 
 * Banking and Insurance 
 */

class Project {
    private String projectTitle;
    private Set<String> technologies;
    
    public Project() {}
    
	public Project(String projectTitle, Set<String> technologies) {
		super();
		this.projectTitle = projectTitle;
		this.technologies = technologies;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public Set<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(Set<String> technologies) {
		this.technologies = technologies;
	}

	@Override
	public String toString() {
		return "Project [projectTitle=" + projectTitle + ", technologies=" + technologies + "]";
	}

	
    
}
 
 
public class FlatMapDemoEx01 {
    public static void main(String[] args) {
    	
    	Project project1 = new Project("Banking", 
    				Stream.of("Oracle", "Java", "Angular").collect(Collectors.toSet())); 

    	Project project2 = new Project("Insurance", 
    			Stream.of("Cobol", "DB2", "Oracle").collect(Collectors.toSet())); 

    	List<Project> list = Stream.of(project1, project2).collect(Collectors.toList());  

    	List<String> collect =
    				list.stream()
    				.map(x -> x.getTechnologies())   // shall give the set of technologies
    				.flatMap(x -> x.stream()) // the mapped technologies get the stream of values as string 
    				.distinct()	// return only unique values, "Oracle" shall be filtered 
    				.collect(Collectors.toList());

        collect.forEach(x -> System.out.println(x));
        
    }

}
