import java.io.*;
import groovy.io.*;
import java.util.Calendar.*;
import java.text.SimpleDateFormat

@NonCPS
def call (Map config=[:]){

    def date = new Date()
    def sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss")
    echo "Date and Time is:" sdf.format(date)
    
    echo "Release Note ..."
    echo "Build"
    if (config.changes != "false"){
        echo "changes"
    }

}