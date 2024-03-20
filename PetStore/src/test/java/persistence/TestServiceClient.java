package persistence;

import com.petStore.*;
import com.swagger.persistence.PetStoreDao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestServiceClient {

    @Test
    public void testGetPetIdSuccess() {
        PetStoreDao dao = new PetStoreDao();
        assertEquals(2, dao.getPetById().getId());
    }
}