/**
 * Gary Sundquist
 * Code from tutorial at: https://www.tutorialspoint.com/jsf/jsf_valuechangelistener_tag.htm
 */
package JSFAnswers;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class AnswerChangeListener implements ValueChangeListener {
   @Override
   public void processValueChange(ValueChangeEvent event)
      throws AbortProcessingException {
      //access Answer bean directly
      UserData userData = (UserData) FacesContext.getCurrentInstance().
         getExternalContext().getSessionMap().get("userData");
      userData.setSelectedAnswer(event.getNewValue().toString());
   }
}
