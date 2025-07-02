package org.example;

import java.util.List;

public class Empl {
    private String name;
    private List<String> skills;

    public Empl(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }
}
