package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name ) {
        this.name = name;

    }
    public void addSkills(String ... skillString) {

        for (String element: skillString) {

            String split[] = element.split("\\(");
            String splitNumber = split[1].substring(0, 1);
            int skillLevel = Integer.parseInt(splitNumber);
            String skillName = split[0].trim();

            skills.add(new Skill(skillName, skillLevel));
        }
    }

    public int findSkillLevelByName(String skillName) {

        int skillLevel = 0;

        for (Skill skill : skills) {
            if (skill.getName().equals(skillName)) {
                skillLevel = skill.getLevel();
            }
        }
            if (skillLevel == 0) {
                throw new SkillNotFoundException("No skill with the name!");
            }
        return skillLevel;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

}
