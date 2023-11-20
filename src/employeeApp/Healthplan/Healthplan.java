package employeeApp.Healthplan;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;

    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
