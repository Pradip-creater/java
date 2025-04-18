import java.applet.Applet;
import java.awt.*;

/* 
<applet code="CityListApplet.class" width=300 height=200>
</applet>
*/

public class CityListApplet extends Applet {
    public void init() {
        // Create a List component with 5 visible rows
        List cityList = new List(5, false); // 5 visible items, single selection
        
        // Add 5 different cities to the list
        cityList.add("New York");
        cityList.add("London");
        cityList.add("Tokyo");
        cityList.add("Paris");
        cityList.add("Sydney");
        
        // Add the list to the applet
        add(cityList);

        // Optional: Set background color
        setBackground(Color.lightGray);
    }
}

  # html code 
<html>
<head>
    <title>City List Applet</title>
</head>
<body>
    <applet code="CityListApplet.class" width="300" height="200">
    </applet>
</body>
</html>
