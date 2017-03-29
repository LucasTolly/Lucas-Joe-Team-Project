package persistence;

import entity.Quirk;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tolly on 3/29/2017.
 */
public class QuirkDao {

    /**
     * Returns a list of all quirks
     * @return all quirks
     */
    public List<Quirk> getAllQuirks() {
        List<Quirk> quirks = new ArrayList<Quirk>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        quirks = session.createCriteria(Quirk.class).list();
        return quirks;
    }

    /**
     * Retrieves a quirk given its id
     * @param quirkId the quirk's id
     * @return the quirk
     */
    public Quirk getQuirk(int quirkId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Quirk quirk = (Quirk) session.get(Quirk.class, quirkId);
        return quirk;
    }

    /**
     * Adds the quirk to the database
     * @param quirk
     * @return the newly created quirk's id
     */
    public int addQuirk(Quirk quirk) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int quirkId = (Integer)session.save(quirk);
        transaction.commit();
        return quirkId;
    }

    /**
     * Deletes the quirk from the database
     * @param quirkId the quirk's id
     */
    public void deleteQuirk(int quirkId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Quirk quirk = (Quirk) session.get(Quirk.class, quirkId);
        session.delete(quirk);
        transaction.commit();
    }

    /**
     * Updates the quirk in the database
     * @param quirk
     */
    public void updateQuirk(Quirk quirk) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(quirk);
        transaction.commit();
    }
}
