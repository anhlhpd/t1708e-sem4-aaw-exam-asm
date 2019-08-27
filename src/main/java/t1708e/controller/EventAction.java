package t1708e.controller;

import com.opensymphony.xwork2.ActionSupport;
import t1708e.entity.Event;

import java.util.ArrayList;
import java.util.List;

public class EventAction extends ActionSupport {

    private Event event;

    private static List<Event> events = new ArrayList<Event>();

    public String create(){
        return SUCCESS;
    }

    public String store(){
        if (this.event != null){
            events.add(this.event);
        }
        return SUCCESS;
    }

    public String list(){
        return SUCCESS;
    }

    public String edit(){
        return SUCCESS;
    }

    public String delete(){
        events.remove(this.event);
        return SUCCESS;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public static List<Event> getList() {
        return events;
    }

    public static void setList(List<Event> events) {
        EventAction.events = events;
    }
}
