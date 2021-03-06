package gw.internal.schema.gw.xsd.w3c.xmlschema;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Sequence extends gw.xml.XmlElement implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_MaxOccurs = new javax.xml.namespace.QName( "", "maxOccurs", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_MinOccurs = new javax.xml.namespace.QName( "", "minOccurs", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Annotation = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "annotation", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Any = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "any", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Choice = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "choice", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Element = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "element", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Group = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "group", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Sequence = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "sequence", "xs" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "sequence", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.Sequence" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPEINSTANCETYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.types.complex.ExplicitGroup" );
          }
        };

  public Sequence() {
    this( new gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.ExplicitGroup() );
  }

  public Sequence( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.ExplicitGroup typeInstance ) {
    super( $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  protected Sequence( javax.xml.namespace.QName qname, gw.lang.reflect.IType type, gw.lang.reflect.IType schemaDefinedTypeInstanceType, gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType typeInstance ) {
    super( qname, type, schemaDefinedTypeInstanceType, typeInstance );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.ExplicitGroup getTypeInstance() {
    //noinspection RedundantCast
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.ExplicitGroup) super.getTypeInstance();
  }

  public void setTypeInstance( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.ExplicitGroup param ) {
    super.setTypeInstance( param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation Annotation() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation) TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().getValue( this );
  }

  public void setAnnotation$( gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation param ) {
    TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Any> Any() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Any>) TYPE.get().getTypeInfo().getProperty( "Any" ).getAccessor().getValue( this );
  }

  public void setAny$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Any> param ) {
    TYPE.get().getTypeInfo().getProperty( "Any" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Choice> Choice() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Choice>) TYPE.get().getTypeInfo().getProperty( "Choice" ).getAccessor().getValue( this );
  }

  public void setChoice$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Choice> param ) {
    TYPE.get().getTypeInfo().getProperty( "Choice" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.ExplicitGroup_Element> Element() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.ExplicitGroup_Element>) TYPE.get().getTypeInfo().getProperty( "Element" ).getAccessor().getValue( this );
  }

  public void setElement$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.ExplicitGroup_Element> param ) {
    TYPE.get().getTypeInfo().getProperty( "Element" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.ExplicitGroup_Group> Group() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.ExplicitGroup_Group>) TYPE.get().getTypeInfo().getProperty( "Group" ).getAccessor().getValue( this );
  }

  public void setGroup$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.ExplicitGroup_Group> param ) {
    TYPE.get().getTypeInfo().getProperty( "Group" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Id() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().getValue( this );
  }

  public void setId$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().setValue( this, param );
  }


  public java.lang.String MaxOccurs() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "MaxOccurs" ).getAccessor().getValue( this );
  }

  public void setMaxOccurs$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "MaxOccurs" ).getAccessor().setValue( this, param );
  }


  public java.math.BigInteger MinOccurs() {
    return (java.math.BigInteger) TYPE.get().getTypeInfo().getProperty( "MinOccurs" ).getAccessor().getValue( this );
  }

  public void setMinOccurs$( java.math.BigInteger param ) {
    TYPE.get().getTypeInfo().getProperty( "MinOccurs" ).getAccessor().setValue( this, param );
  }


  @SuppressWarnings( {"MethodNameSameAsClassName"} )
  public java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence> Sequence() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence>) TYPE.get().getTypeInfo().getProperty( "Sequence" ).getAccessor().getValue( this );
  }

  public void setSequence$( java.util.List<gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence> param ) {
    TYPE.get().getTypeInfo().getProperty( "Sequence" ).getAccessor().setValue( this, param );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( byte[] byteArray ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( byte[] byteArray, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.io.File file ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.io.InputStream inputStream ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.io.InputStream inputStream, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.io.Reader reader ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.lang.String xmlString ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.net.URL url ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Sequence) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url, options } );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 2110283714877373226L;

}
