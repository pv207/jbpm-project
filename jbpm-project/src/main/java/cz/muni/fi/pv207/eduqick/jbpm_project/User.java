package cz.muni.fi.pv207.eduqick.jbpm_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@org.kie.api.definition.type.Label("User")
@org.kie.api.definition.type.Description("User Description")
public class User implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "USER_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "USER_ID_SEQ", name = "USER_ID_GENERATOR")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Login")
   private java.lang.String login;

   @org.kie.api.definition.type.Label("Name")
   private java.lang.String name;

   @org.kie.api.definition.type.Label("Surname")
   private java.lang.String surname;

   @org.kie.api.definition.type.Label("e-mail")
   private java.lang.String email;

   @org.kie.api.definition.type.Label("Corporate Account ?")
   private java.lang.Boolean corporateAccount;

   public User()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getLogin()
   {
      return this.login;
   }

   public void setLogin(java.lang.String login)
   {
      this.login = login;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getSurname()
   {
      return this.surname;
   }

   public void setSurname(java.lang.String surname)
   {
      this.surname = surname;
   }

   public java.lang.String getEmail()
   {
      return this.email;
   }

   public void setEmail(java.lang.String email)
   {
      this.email = email;
   }

   public java.lang.Boolean getCorporateAccount()
   {
      return this.corporateAccount;
   }

   public void setCorporateAccount(java.lang.Boolean corporateAccount)
   {
      this.corporateAccount = corporateAccount;
   }

   public User(java.lang.Long id, java.lang.String login, java.lang.String name,
         java.lang.String surname, java.lang.String email,
         java.lang.Boolean corporateAccount)
   {
      this.id = id;
      this.login = login;
      this.name = name;
      this.surname = surname;
      this.email = email;
      this.corporateAccount = corporateAccount;
   }

}