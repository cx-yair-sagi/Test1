public class B {

  public static void main(String args[]) {
  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
  String input = bufferedReader.readLine();
  String userid = input;
String query = "SELECT * FROM users WHERE userid ='"+ userid + "'" + " AND password='" + password + "'";
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery(query);
}
}
