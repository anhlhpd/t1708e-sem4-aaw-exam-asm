package t1708e.controller;

import com.opensymphony.xwork2.ActionSupport;
import t1708e.entity.Event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventAction extends ActionSupport {

    private Event event;

    private static List<Event> events = new ArrayList<>();

    static long editId = 0;

    public String create() {
        return SUCCESS;
    }

    public String store() {
        if (editId != 0){
            for (int i = 0 ; i< events.size() ; i++){
                if (events.get(i).getId() == editId){
                    this.event.setId(editId);
                    events.set(i,event);
                    editId = 0;
                    break;
                }
            }
            return SUCCESS;
        }
        if (this.event != null) {
            events.add(this.event);
        }

        return SUCCESS;
    }

    public String list() {
        return SUCCESS;
    }

    public String edit(){
        for (int i = 0 ; i< events.size() ; i++){
            if (events.get(i).getId() == editId){
                this.setEvent(events.get(i));
                break;
            }
        }
        return SUCCESS;
    }

    public String delete(){
        Iterator it =  events.iterator();
        while (it.hasNext()){
            Event ev = (Event)it.next();
            if (ev.getId() == editId){
                it.remove();
                break;
            }
        }
        return SUCCESS;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        EventAction.events = events;
    }

    public long getEditId() {
        return editId;
    }

    public void setEditId(long editId) {
        EventAction.editId = editId;
    }
}
