public class Repo {
    private String name;
    private String description;
    private int stargazers_count;
    private String language;

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStargazers_count() {
        return stargazers_count;
    }

    public void setStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Repo{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", stars=" + stargazers_count +
                ", language='" + language + '\'' +
                '}';
    }
}
