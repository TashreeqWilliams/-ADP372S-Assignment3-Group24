package za.ac.cput.service.entity;

import za.ac.cput.entity.Auditor;
import za.ac.cput.repository.entity.AuditorRepository;
import za.ac.cput.repository.impl.IAuditorRepository;
import za.ac.cput.service.impl.IAuditorService;

import java.util.HashSet;
import java.util.Set;

public class AuditorService implements IAuditorService {

    private static AuditorService service = null;
    private AuditorRepository repository;

    private AuditorService(){this.repository = AuditorRepository.getRepository();}

    public static AuditorService getService(){
        if(service == null){service = new AuditorService();}
        return service;
    }

    @Override
    public Set<Auditor> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Auditor create(Auditor auditor) {
        return this.repository.create(auditor);
    }

    @Override
    public Auditor read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Auditor update(Auditor auditor) {
        return repository.update(auditor);
    }

    @Override
    public boolean delete(String s) { return repository.delete(s);
    }
    public Set<Auditor> getAllAuditorsStartWithA(){
        Set<Auditor> auditorWithA = new HashSet<Auditor>();
        Set<Auditor> auditors = getAll();
        for(Auditor auditor: auditors){
            if(auditor.getAuditorID().trim().toLowerCase().startsWith("a")){
                auditorWithA.add(auditor);
            }
        }
        return auditorWithA;
    }//This supposed to be race clas under demography
    public Auditor getAuditorGivenFirstName(String auditorName){
        Auditor a = null;
        Set<Auditor> auditors = getAll();
        for(Auditor auditor: auditors){
            if(auditor.getAuditorFirstName().equals(auditorName)){

                a = auditor;
                break;

            }
        }

        return a;
    }
}
