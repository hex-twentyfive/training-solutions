package exam03retake01;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();


    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> findByCriteria(String criteria) {
        if (criteria.startsWith("from:")) {
            return  searchByFrom(criteria.substring(5));
        } else if (criteria.startsWith("to:")) {
            return searchByTo(criteria.substring(3));
        } else {
            return searchByWord(criteria);
        }
    }

    private List<Mail> searchByFrom(String criteria) {
        List<Mail> result = new ArrayList<>();
        for (Mail e : mails) {
            if (criteria.equals(e.getFrom().getName()) || criteria.equals(e.getFrom().getEmail())) {
                result.add(e);
            }
        }
        noMatchHandling(result, criteria);
        return result;
    }

    private List<Mail> searchByTo(String criteria) {
        List<Mail> result = new ArrayList<>();
        for (Mail e : mails) {
            for (Contact contact : e.getTo())
                if (criteria.equals(contact.getName()) || criteria.equals(contact.getEmail())) {
                    result.add(e);
                }
        }
        noMatchHandling(result, criteria);
        return result;
    }

    private List<Mail> searchByWord(String criteria) {
        List<Mail> result = new ArrayList<>();
        for (Mail e : mails) {
            if (e.getSubject().contains(criteria) || e.getMessage().contains(criteria)) {
                result.add(e);
            }
        }
        noMatchHandling(result, criteria);
        return result;
    }

    private void noMatchHandling(List<Mail> input, String criteria) {
        if (input.size() == 0) {
            throw new IllegalArgumentException("No letters can be found based on the criteria! --> " + criteria);
        }
    }

    public List<Mail> getMails() {
        return new ArrayList<>(mails);
    }

}