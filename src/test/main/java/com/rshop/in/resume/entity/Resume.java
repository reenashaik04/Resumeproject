package com.rshop.in.resume.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

public class Resume {
	
		
		private Long resumeId;
		private String name;
		private String details;
		
		@ManyToMany(mappedBy = "Skills", cascade=CascadeType.ALL)
		private List<Skills> skills;
		@OneToMany(mappedBy = "Certifications", cascade=CascadeType.ALL)
		private List<Certifications> certifications;
		@OneToMany(mappedBy = "Experience", cascade=CascadeType.ALL)
		private List<Experience> experience;
		@OneToMany(mappedBy = "Resume", cascade=CascadeType.ALL)
		private List<Resume> resume;
		@OneToMany(mappedBy = "Projects", cascade=CascadeType.ALL)
		private List<Projects> projects;
		
		
		private User user;
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Long getResumeId() {
			return resumeId;
		}
		public void setResumeId(Long resumeId) {
			this.resumeId = resumeId;
		}


		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDetails() {
			return details;
		}
		public void setDetails(String details) {
			this.details = details;
		}
		
		public Resume(Long id, String name, String userName,String phoneNo,String email,String password,Long resumeId,
				List<com.rshop.in.resume.entity.Skills> Skills, List<com.rshop.in.resume.entity.Certifications> Certifications,
				List<com.rshop.in.resume.entity.Experience> Experience, List<com.rshop.in.resume.entity.Resume> Resume,
				List<com.rshop.in.resume.entity.Projects>Projects, List<Skills> skills, List<Experience> experience,
				 List<Certifications> certifications,List<Resume> resume, List<Projects> projects){
			super();
			this.resumeId = resumeId;
			this.skills = skills;
			this.certifications = certifications;
			this.experience = experience;
			
			this.resume = resume;
			this.projects = projects;
	}
		public Resume() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	}



