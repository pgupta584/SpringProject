package com.example.practice1.mailSenderService.model;

public class AddResume
{
  private String Name;
  private String Technology;
  private int YearOfExperience;
  private String Link;

    public AddResume(String Name, String Technology,int YearOfExperience,String Link)
    {
        this.Name=Name;
        this.Technology=Technology;
        this.YearOfExperience=YearOfExperience;
        this.Link=Link;
    }
    public String toString()
    {
        return "AddResume [Name=" + Name + ", Technology=" + Technology + "+ YearOfExperience=" + YearOfExperience + ", Link=" + Link + "]";
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getTechnology() {
        return Technology;
    }

    public void setTechnology(String technology) {
        this.Technology = technology;
    }

    public int getYearOfExperience() {
        return YearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        YearOfExperience = yearOfExperience;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }
}
