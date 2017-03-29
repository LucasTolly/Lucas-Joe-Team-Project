package persistence;

import entity.Origin;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tolly on 3/29/2017.
 */
public class OriginDao {

    /**
     * Returns a list of all origins
     * @return all origins
     */
    public List<Origin> getAllOrigins() {
        List<Origin> origins = new ArrayList<Origin>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        origins = session.createCriteria(Origin.class).list();
        return origins;
    }

    /**
     * Retrieves a origin given its id
     * @param originId the origin's id
     * @return the origin
     */
    public Origin getOrigin(int originId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Origin origin = (Origin) session.get(Origin.class, originId);
        return origin;
    }

    /**
     * Adds the origin to the database
     * @param origin
     * @return the newly created origin's id
     */
    public int addOrigin(Origin origin) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int originId = (Integer)session.save(origin);
        transaction.commit();
        return originId;
    }

    /**
     * Deletes the origin from the database
     * @param originId the origin's id
     */
    public void deleteOrigin(int originId) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Origin origin = (Origin) session.get(Origin.class, originId);
        session.delete(origin);
        transaction.commit();
    }

    /**
     * Updates the origin in the database
     * @param origin
     */
    public void updateOrigin(Origin origin) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(origin);
        transaction.commit();
    }
}
