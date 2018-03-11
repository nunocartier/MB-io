package pt.ist.fenixframework;


@SuppressWarnings("all")
public abstract class DomainRoot_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> getRelationDomainRootHasInstallationData() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> getRelationDomainRootDomainFenixFrameworkRoot() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  DomainRoot_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.data.InstallationData getInstallationData() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setInstallationData(pt.ist.fenixframework.data.InstallationData installationData) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.fenixframework.DomainFenixFrameworkRoot getDomainFenixFrameworkRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDomainFenixFrameworkRoot(pt.ist.fenixframework.DomainFenixFrameworkRoot domainFenixFrameworkRoot) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
