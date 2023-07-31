public class UserDao {

    public void add(User user) throws Exception{
        class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConncection(
                "jdbc:mysql://localhost/springbook","spring","book");

        PreparedStatement ps = c.prepateStatement(
                "insert into users(id, name, password) values(?,?,?)");

        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.exectueUpdate();

        ps.close();
        c.close();
    }


    public User get(String id) throws Exception{
        class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConncection(
                "jdbc:mysql://localhost/springbook","spring","book");

        PreparedStatement ps = c.prepateStatement(
                "select * from users where id = ?");

        ps.setString(1, id);

        ResultSet rs = ps.exectueQuery();
        rs.next();

        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return user;

    }



}