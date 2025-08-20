package api.endpoints;

/** Central place for API routes/URLs. */
public class Routes {
    public static String base_URL = "https://reqres.in/";
    public static String get_URL  = base_URL + "api/users?page={pageNumber}";
    public static String create_user_URL = base_URL + "api/users";
}
