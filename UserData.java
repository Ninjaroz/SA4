/**
 * Gary Sundquist
 * Code from tutorial at: https://www.tutorialspoint.com/jsf/jsf_valuechangelistener_tag.htm
 */
package JSFAnswers;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

private static final long serialVersionUID = 1L;
	
   private static Map<String,String> AnswerMap;
   private String selectedAnswer = "Yes"; 
   
   static{
	   AnswerMap = new LinkedHashMap<String,String>();
	   AnswerMap.put("Yes", "Yes"); 
	   AnswerMap.put("No", "No");
   }

   public void AnswerChanged(ValueChangeEvent e){
      //assign new value to answer
      selectedAnswer= e.getNewValue().toString(); 
   }

   public Map<String, String> getAnswers() {
      return AnswerMap;
   }

   public String getSelectedAnswer() {
      return selectedAnswer;
   }

   public void setSelectedAnswer(String selectedAnswer) {

      this.selectedAnswer = selectedAnswer;
   }
   
   
   public String Begin() {
       if ( selectedAnswer.equals("Yes")){
           return "MMORPG";
       }
           return "OutDoors";   
   }  
   public String MMORPG() {
       if ( selectedAnswer.equals("Yes")){
           return "WOW";
       }
           return "FPS";   
   }
   public String FPS() {
       if ( selectedAnswer.equals("Yes")){
           return "Halo";
       }
           return "RTS";   
   }
   public String RTS() {
       if ( selectedAnswer.equals("Yes")){
           return "LOL";
       }
           return "OutDoors";   
   }
   public String OutDoors() {
       if ( selectedAnswer.equals("Yes")){
           return "Water";
       }
           return "Hobbies";   
   }
   public String Hobbies() {
       if ( selectedAnswer.equals("Yes")){
           return "Gardening";
       }
           return "NoSuggestion";   
   }
   public String Water() {
       if ( selectedAnswer.equals("Yes")){
           return "Fishing";
       }
           return "Hiking";   
   }
   public String Fishing() {
       if ( selectedAnswer.equals("Yes")){
           return "FishingRod";
       }
           return "Kayaking";   
   }
   public String Kayaking() {
       if ( selectedAnswer.equals("Yes")){
           return "BuyKayak";
       }
           return "NoSuggestion";   
   }
   public String Hiking() {
       if ( selectedAnswer.equals("Yes")){
           return "HikingBoots";
       }
           return "Camping";   
   }
   public String Camping() {
       if ( selectedAnswer.equals("Yes")){
           return "BuyTent";
       }
           return "Snow";   
   }
   public String Gardening() {
       if ( selectedAnswer.equals("Yes")){
           return "Gardeningtools";
       }
           return "Painting";   
   }
   public String Painting() {
       if ( selectedAnswer.equals("Yes")){
           return "BuyBrushes";
       }
           return "NoSuggestion";   
   }
   public String Snow() {
       if ( selectedAnswer.equals("Yes")){
           return "SnowBoarding";
       }
           return "NoSuggestion";   
   }
   public String SnowBoarding() {
       if ( selectedAnswer.equals("Yes")){
           return "BuySnowBoard";
       }
           return "Skiing";   
   }
   public String Skiing() {
       if ( selectedAnswer.equals("Yes")){
           return "BuySkis";
       }
           return "NoSuggestion";   
   }
}

