//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vBeta 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.18 at 05:29:09 SGT 
//


package sparrow.elt.jaxb.impl;

public class HANDLETypeImpl implements sparrow.elt.jaxb.HANDLEType, com.sun.xml.bind.unmarshaller.UnmarshallableObject, com.sun.xml.bind.serializer.XMLSerializable, com.sun.xml.bind.validator.ValidatableObject
{

    private final static Class PRIMARY_INTERFACE_CLASS = sparrow.elt.jaxb.HANDLEType.class;
    protected java.util.ArrayList _ERROR = new java.util.ArrayList();
    protected String _HANDLER;
    protected String _EXCEPTION;
    private final static com.sun.msv.grammar.Grammar schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize("\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0091Ue\u00f1\u0017p\u00f3\u00ad\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp\u009f\u008d\u000fi<\u00c1_\u00b7\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/grammar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ecachedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0002xp\u0003\u00fe\u0088\u00f5ppsq\u0000~\u0000\u0000\u000146\u00f4ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u00cc;^\u00bb\u0004E\u00cc\u00db\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\'\u00bbhe^\u001f_5\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u0014\u008c\u0003ppsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u008b\u0010\u001fsu\u008b\u0091\u00c2\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u00d3\u00c6b\u0095\u0015\rC\u0092\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u0014\u008c\u0000pp\u0000sq\u0000~\u0000\n\u0000\u0014\u008b\u00f5pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u00c6|\u00ec3\u0087\u00b8\u00f9\u00f4\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0000\u0014\u008b\u00eappsq\u0000~\u0000\u0007\u0000\u0014\u008b\u00dfsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp0\rR\n\u00c7L\n\u0099\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000bxq\u0000~\u0000\u0003\u0000\u0014\u008b\u00dcq\u0000~\u0000\u0013psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u00cb\u00b2\u00f3\u00c9\u0081\u0000\u000f\u00bc\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u0012\u0001psr\u0000 com.sun.msv.grammar.AnyNameClass\u00c3p\u00af\u0013\u00eft\u0094\u00bd\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u009c}\u00d4kB\u00c7\tk\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0098v\u00e3\u0003Z\u00fex\u00ee\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0018psr\u0000#com.sun.msv.grammar.SimpleNameClass\u0091\u00e9\u00f7\u008d\u00ab\u0010\u00aa\u00f5\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\u001fxq\u0000~\u0000\u001at\u0000\u001ecom.cs.sg.spear.jaxb.ERRORTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u001et\u0000\u0005ERRORt\u0000\u0000sq\u0000~\u0000\u0014\u0001\u001f\u00aa\u00ecppsr\u0000\u001bcom.sun.msv.grammar.DataExp8\u00f5\u00f5>{j!\u00cb\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003\u0001\u001e\u001ewppsr\u0000#com.sun.msv.datatype.xsd.StringType\u00c0\t\u00a9y\u00f6\u0011\u009b\u00e6\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0002\u00ff10\u00a8bR\u00ca\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType7\u00adsa|\u00d7Z\u001d\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl4\u00e9\u0099H.\u00872z\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\u001fL\u0000\btypeNameq\u0000~\u0000\u001fL\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0006stringsr\u0000.com.sun.msv.datatype.xsd.WhiteSpaceProcessor$1\u0013JMoI\u00db\u00a4G\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessorip\u00ff0C\u00ce\u000eN\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression s\u0080\u0089\u0096\u00cf\u009a@\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\nq\u0000~\u0000\u0013psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u001fL\u0000\fnamespaceURIq\u0000~\u0000\u001fxpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000\u001et\u0000\tEXCEPTIONq\u0000~\u0000%sq\u0000~\u0000\u000f\u0002\u00caQ\u00fcppsq\u0000~\u0000\u0014\u0002\u00caQ\u00f1q\u0000~\u0000\u0013pq\u0000~\u0000*sq\u0000~\u0000\u001et\u0000\u0007HANDLERq\u0000~\u0000%q\u0000~\u0000\u001dsr\u0000\"com.sun.msv.grammar.ExpressionPool\u00e5\u00f3J;\u00cd]^\u00f8\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL\u0000\u0006parentq\u0000~\u0000A[\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000\u0000\u0000\u0006\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000\u0000\u00bfpppppppppppppq\u0000~\u0000\tpppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\u0005ppppppppppppppppppppq\u0000~\u0000\u0006ppppppppppppppppppppppq\u0000~\u0000<ppq\u0000~\u0000\u0011ppppppppppq\u0000~\u0000\u0010ppppppppppp");

    public java.util.List getERROR() {
        return _ERROR;
    }

    public String getHANDLER() {
        if (_HANDLER == null) {
            return "default.exception.handler";
        } else {
            return _HANDLER;
        }
    }

    public void setHANDLER(String value) {
        _HANDLER = value;
    }

    public String getEXCEPTION() {
        return _EXCEPTION;
    }

    public void setEXCEPTION(String value) {
        _EXCEPTION = value;
    }

    public com.sun.xml.bind.unmarshaller.ContentHandlerEx getUnmarshaller(com.sun.xml.bind.unmarshaller.UnmarshallingContext context) {
        return new sparrow.elt.jaxb.impl.HANDLETypeImpl.Unmarshaller(context);
    }

    public Class getPrimaryInterfaceClass() {
        return PRIMARY_INTERFACE_CLASS;
    }

    public void serializeElements(com.sun.xml.bind.serializer.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _ERROR.size();
        while (idx1 != len1) {
            context.startElement("", "ERROR");
            int idx_0 = idx1;
            context.childAsAttributes(((com.sun.xml.bind.serializer.XMLSerializable) _ERROR.get(idx_0 ++)));
            context.endAttributes();
            context.childAsElements(((com.sun.xml.bind.serializer.XMLSerializable) _ERROR.get(idx1 ++)));
            context.endElement();
        }
    }

    public void serializeAttributes(com.sun.xml.bind.serializer.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _ERROR.size();
        context.startAttribute("", "EXCEPTION");
        context.text(((String) _EXCEPTION));
        context.endAttribute();
        if (_HANDLER!= null) {
            context.startAttribute("", "HANDLER");
            context.text(((String) _HANDLER));
            context.endAttribute();
        }
    }

    public void serializeAttributeBodies(com.sun.xml.bind.serializer.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _ERROR.size();
    }

    public Class getPrimaryInterface() {
        return (sparrow.elt.jaxb.HANDLEType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.xml.bind.unmarshaller.ContentHandlerEx
    {


        public Unmarshaller(com.sun.xml.bind.unmarshaller.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected com.sun.xml.bind.unmarshaller.UnmarshallableObject owner() {
            return sparrow.elt.jaxb.impl.HANDLETypeImpl.this;
        }

        public void enterElement(String ___uri, String ___local, org.xml.sax.Attributes __atts)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  0 :
                    if ("".equals(___uri)&&"ERROR".equals(___local)) {
                        context.pushAttributes(__atts);
                        goto1();
                        return ;
                    }
                    break;
                case  3 :
                    if ("".equals(___uri)&&"ERROR".equals(___local)) {
                        context.pushAttributes(__atts);
                        goto1();
                        return ;
                    }
                    revertToParentFromEnterElement(___uri, ___local, __atts);
                    return ;
            }
            super.enterElement(___uri, ___local, __atts);
        }

        public void leaveElement(String ___uri, String ___local)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  3 :
                    revertToParentFromLeaveElement(___uri, ___local);
                    return ;
                case  2 :
                    if ("".equals(___uri)&&"ERROR".equals(___local)) {
                        context.popAttributes();
                        goto3();
                        return ;
                    }
                    break;
            }
            super.leaveElement(___uri, ___local);
        }

        public void enterAttribute(String ___uri, String ___local)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  1 :
                    if ("".equals(___uri)&&"VALUE".equals(___local)) {
                        _ERROR.add(((sparrow.elt.jaxb.impl.ERRORTypeImpl) spawnChildFromEnterAttribute((sparrow.elt.jaxb.impl.ERRORTypeImpl.class), 2, ___uri, ___local)));
                        return ;
                    }
                    if ("".equals(___uri)&&"CODE".equals(___local)) {
                        _ERROR.add(((sparrow.elt.jaxb.impl.ERRORTypeImpl) spawnChildFromEnterAttribute((sparrow.elt.jaxb.impl.ERRORTypeImpl.class), 2, ___uri, ___local)));
                        return ;
                    }
                    if ("".equals(___uri)&&"TYPE".equals(___local)) {
                        _ERROR.add(((sparrow.elt.jaxb.impl.ERRORTypeImpl) spawnChildFromEnterAttribute((sparrow.elt.jaxb.impl.ERRORTypeImpl.class), 2, ___uri, ___local)));
                        return ;
                    }
                    break;
                case  3 :
                    if ("".equals(___uri)&&"EXCEPTION".equals(___local)) {
                        state = 4;
                        return ;
                    }
                    if ("".equals(___uri)&&"HANDLER".equals(___local)) {
                        state = 6;
                        return ;
                    }
                    revertToParentFromEnterAttribute(___uri, ___local);
                    return ;
            }
            super.enterAttribute(___uri, ___local);
        }

        public void leaveAttribute(String ___uri, String ___local)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (state) {
                case  5 :
                    if ("".equals(___uri)&&"EXCEPTION".equals(___local)) {
                        goto3();
                        return ;
                    }
                    break;
                case  7 :
                    if ("".equals(___uri)&&"HANDLER".equals(___local)) {
                        goto3();
                        return ;
                    }
                    break;
                case  3 :
                    revertToParentFromLeaveAttribute(___uri, ___local);
                    return ;
            }
            super.leaveAttribute(___uri, ___local);
        }

        public void text(String value)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            try {
                switch (state) {
                    case  6 :
                        _HANDLER = value;
                        state = 7;
                        return ;
                    case  3 :
                        revertToParentFromText(value);
                        return ;
                    case  4 :
                        _EXCEPTION = value;
                        state = 5;
                        return ;
                }
            } catch (RuntimeException e) {
                handleUnexpectedTextException(value, e);
            }
        }

        public void leaveChild(int nextState)
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            switch (nextState) {
                case  2 :
                    state = 2;
                    return ;
            }
            super.leaveChild(nextState);
        }

        private void goto1()
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            int idx;
            state = 1;
            idx = context.getAttribute("", "VALUE");
            if (idx >= 0) {
                context.consumeAttribute(idx);
                return ;
            }
            idx = context.getAttribute("", "TYPE");
            if (idx >= 0) {
                context.consumeAttribute(idx);
                return ;
            }
            idx = context.getAttribute("", "CODE");
            if (idx >= 0) {
                context.consumeAttribute(idx);
                return ;
            }
        }

        private void goto3()
            throws com.sun.xml.bind.unmarshaller.UnreportedException
        {
            int idx;
            state = 3;
            idx = context.getAttribute("", "EXCEPTION");
            if (idx >= 0) {
                context.consumeAttribute(idx);
                return ;
            }
            idx = context.getAttribute("", "HANDLER");
            if (idx >= 0) {
                context.consumeAttribute(idx);
                return ;
            }
        }

    }

}
