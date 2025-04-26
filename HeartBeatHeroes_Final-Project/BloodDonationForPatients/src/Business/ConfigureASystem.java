package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Requests.PatientRequest;
import Business.Requests.PatientRequestDirectory;
import Business.Role.CaseManagerRole;
import Business.Role.GovernmentAgentRole;
import Business.Role.LabEmployeeRole;
import Business.Role.LocalClinicStaffRole;
import Business.Role.LogisticsOfficerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author krish19
 */
public class ConfigureASystem {

    // Let's create a sample patient request to test our setup
    public static void addSampleRequestData(EcoSystem system) {
        PatientRequestDirectory prd = system.getPatientRequestDirectory();
        PatientRequest sampleRequest = new PatientRequest(prd);
        sampleRequest.setName("Jack");
        sampleRequest.setAge(35);
        sampleRequest.setCity("Boston");
        sampleRequest.setEmailID("jack@northeastern.edu");
        prd.addPatientRequest(sampleRequest);
    }

    // This method configures the entire ecosystem with some default enterprises, organizations and users
    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        // Setting up a new network for the US region
        Network worldCordNetwork = system.createAndAddNetwork();
        worldCordNetwork.setName("Hearbeat Heroes");
        worldCordNetwork.setCountry("US");

        Enterprise hq = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("US Headquarters", Enterprise.EnterpriseType.Headquarter);
        Enterprise government = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("Government Agency", Enterprise.EnterpriseType.Government);
        Enterprise logistics = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("Logistics", Enterprise.EnterpriseType.Logistics);
        Enterprise localClinic = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("Local Clinics", Enterprise.EnterpriseType.LocalClinic);
        Enterprise laboratory = worldCordNetwork.getEnterpriseDirectory().createAndAddEnterprise("Laboratories", Enterprise.EnterpriseType.Laboratory);

        Employee officeAdminEmployee = hq.getEmployeeDirectory().createEmployee("Office Administrator");
        UserAccount officeadmin = hq.getUserAccountDirectory().createUserAccount("officeadmin", "password", officeAdminEmployee, new SystemAdminRole());

        Employee governmentAdminEmployee = government.getEmployeeDirectory().createEmployee("Government Admin");
        UserAccount governmentAdmin = government.getUserAccountDirectory().createUserAccount("governmentadmin", "password", governmentAdminEmployee, new SystemAdminRole());

        Employee logisticsGuyEmployee = logistics.getEmployeeDirectory().createEmployee("Logistics Admin");
        UserAccount logisticsGuy = logistics.getUserAccountDirectory().createUserAccount("logisticsguy", "password", logisticsGuyEmployee, new SystemAdminRole());

        Employee localClinicAdminEmployee = localClinic.getEmployeeDirectory().createEmployee("Local Clinic Admin");
        UserAccount localClinicAdmin = localClinic.getUserAccountDirectory().createUserAccount("localclinicadmin", "password", localClinicAdminEmployee, new SystemAdminRole());

        Employee labAdminEmployee = laboratory.getEmployeeDirectory().createEmployee("Lab Admin");
        UserAccount labAdmin = laboratory.getUserAccountDirectory().createUserAccount("labadmin", "password", labAdminEmployee, new SystemAdminRole());

        Organization hqOrg = hq.getOrganizationDirectory().createOrganization(Organization.Type.Headquarter, "US Headquarters Organization");
        Organization governmentOrg = government.getOrganizationDirectory().createOrganization(Organization.Type.Government, "Government Organization");
        Organization logisticsOrg = logistics.getOrganizationDirectory().createOrganization(Organization.Type.Logistics, "Logistics Organization");
        Organization localClinicOrg = localClinic.getOrganizationDirectory().createOrganization(Organization.Type.LocalClinic, "Local Clinics Organization");
        Organization laboratoryOrg = laboratory.getOrganizationDirectory().createOrganization(Organization.Type.Laboratory, "Laboratories Organization");

        Employee hqEmployee = hqOrg.getEmployeeDirectory().createEmployee("Case Manager");
        UserAccount caseManager = hqOrg.getUserAccountDirectory().createUserAccount("casemanager", "password", hqEmployee, new CaseManagerRole());

        Employee governmentEmployee = governmentOrg.getEmployeeDirectory().createEmployee("Government Agent");
        UserAccount govAgent = governmentOrg.getUserAccountDirectory().createUserAccount("governmentagent", "password", governmentEmployee, new GovernmentAgentRole());

        Employee logisticsEmployee = logisticsOrg.getEmployeeDirectory().createEmployee("Logistics Officer");
        UserAccount logisticsOfficer = logisticsOrg.getUserAccountDirectory().createUserAccount("logisticsofficer", "password", logisticsEmployee, new LogisticsOfficerRole());

        Employee localClinicEmployee = localClinicOrg.getEmployeeDirectory().createEmployee("Local Clinic Staff");
        UserAccount localClinicStaff = localClinicOrg.getUserAccountDirectory().createUserAccount("localclinicuser", "password", localClinicEmployee, new LocalClinicStaffRole());

        Employee laboratoryEmployee = laboratoryOrg.getEmployeeDirectory().createEmployee("Lab Employee");
        UserAccount labEmployee = laboratoryOrg.getUserAccountDirectory().createUserAccount("labemployee", "password", laboratoryEmployee, new LabEmployeeRole());

        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        // addSampleRequestData(system);
        return system;
    }
}
