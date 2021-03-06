package gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class NamedGroup extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.RealGroup implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Name = new javax.xml.namespace.QName( "", "name", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_All = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "all", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Annotation = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "annotation", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Choice = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "choice", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Sequence = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "sequence", "xs" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "namedGroup", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.types.complex.NamedGroup" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public NamedGroup() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected NamedGroup( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  @Deprecated
  public gw.internal.schema.gw.xsd.w3c.xmlschema.All All$$gw_xsd_w3c_xmlschema_types_complex_RealGroup() {
    return super.All$$gw_xsd_w3c_xmlschema_types_complex_RealGroup();
  }

  @Deprecated
  public void setAll$$gw_xsd_w3c_xmlschema_types_complex_RealGroup$( gw.internal.schema.gw.xsd.w3c.xmlschema.All param ) {
    super.setAll$$gw_xsd_w3c_xmlschema_types_complex_RealGroup$( param );
  }

  public gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.NamedGroup_All All$$gw_xsd_w3c_xmlschema_types_complex_NamedGroup() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.NamedGroup_All) TYPE.get().getTypeInfo().getProperty( "All" ).getAccessor().getValue( this );
  }

  public void setAll$$gw_xsd_w3c_xmlschema_types_complex_NamedGroup$( gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.NamedGroup_All param ) {
    TYPE.get().getTypeInfo().getProperty( "All" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation Annotation() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation) TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().getValue( this );
  }

  public void setAnnotation$( gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation param ) {
    TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().setValue( this, param );
  }


  @Deprecated
  public gw.internal.schema.gw.xsd.w3c.xmlschema.Choice Choice$$gw_xsd_w3c_xmlschema_types_complex_RealGroup() {
    return super.Choice$$gw_xsd_w3c_xmlschema_types_complex_RealGroup();
  }

  @Deprecated
  public void setChoice$$gw_xsd_w3c_xmlschema_types_complex_RealGroup$( gw.internal.schema.gw.xsd.w3c.xmlschema.Choice param ) {
    super.setChoice$$gw_xsd_w3c_xmlschema_types_complex_RealGroup$( param );
  }

  public gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.NamedGroup_Choice Choice$$gw_xsd_w3c_xmlschema_types_complex_NamedGroup() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.NamedGroup_Choice) TYPE.get().getTypeInfo().getProperty( "Choice" ).getAccessor().getValue( this );
  }

  public void setChoice$$gw_xsd_w3c_xmlschema_types_complex_NamedGroup$( gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.NamedGroup_Choice param ) {
    TYPE.get().getTypeInfo().getProperty( "Choice" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Id() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().getValue( this );
  }

  public void setId$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Name() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Name" ).getAccessor().getValue( this );
  }

  public void setName$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Name" ).getAccessor().setValue( this, param );
  }


  @Deprecated
  public gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence Sequence$$gw_xsd_w3c_xmlschema_types_complex_RealGroup() {
    return super.Sequence$$gw_xsd_w3c_xmlschema_types_complex_RealGroup();
  }

  @Deprecated
  public void setSequence$$gw_xsd_w3c_xmlschema_types_complex_RealGroup$( gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence param ) {
    super.setSequence$$gw_xsd_w3c_xmlschema_types_complex_RealGroup$( param );
  }

  public gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.NamedGroup_Sequence Sequence$$gw_xsd_w3c_xmlschema_types_complex_NamedGroup() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.NamedGroup_Sequence) TYPE.get().getTypeInfo().getProperty( "Sequence" ).getAccessor().getValue( this );
  }

  public void setSequence$$gw_xsd_w3c_xmlschema_types_complex_NamedGroup$( gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.NamedGroup_Sequence param ) {
    TYPE.get().getTypeInfo().getProperty( "Sequence" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 2110283714877373226L;

}
