module com.pawelwordsearcher.somedumbapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pawelwordsearcher.somedumbapp to javafx.fxml;
    exports com.pawelwordsearcher.somedumbapp;
}