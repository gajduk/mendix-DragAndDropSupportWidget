// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testdraganddrop.proxies;

public class Detail
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject detailMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestDragAndDrop.Detail";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SequenceNumber("SequenceNumber"),
		Detail_Header("TestDragAndDrop.Detail_Header"),
		Detail_Item("TestDragAndDrop.Detail_Item");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Detail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestDragAndDrop.Detail"));
	}

	protected Detail(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject detailMendixObject)
	{
		if (detailMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestDragAndDrop.Detail", detailMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestDragAndDrop.Detail");

		this.detailMendixObject = detailMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Detail.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testdraganddrop.proxies.Detail initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testdraganddrop.proxies.Detail.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static testdraganddrop.proxies.Detail initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testdraganddrop.proxies.Detail(context, mendixObject);
	}

	public static testdraganddrop.proxies.Detail load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testdraganddrop.proxies.Detail.initialize(context, mendixObject);
	}

	public static java.util.List<testdraganddrop.proxies.Detail> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testdraganddrop.proxies.Detail> result = new java.util.ArrayList<testdraganddrop.proxies.Detail>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestDragAndDrop.Detail" + xpathConstraint))
			result.add(testdraganddrop.proxies.Detail.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of SequenceNumber
	 */
	public final java.lang.Integer getSequenceNumber()
	{
		return getSequenceNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of SequenceNumber
	 */
	public final java.lang.Integer getSequenceNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.SequenceNumber.toString());
	}

	/**
	 * Set value of SequenceNumber
	 * @param sequencenumber
	 */
	public final void setSequenceNumber(java.lang.Integer sequencenumber)
	{
		setSequenceNumber(getContext(), sequencenumber);
	}

	/**
	 * Set value of SequenceNumber
	 * @param context
	 * @param sequencenumber
	 */
	public final void setSequenceNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer sequencenumber)
	{
		getMendixObject().setValue(context, MemberNames.SequenceNumber.toString(), sequencenumber);
	}

	/**
	 * @return value of Detail_Header
	 */
	public final testdraganddrop.proxies.Header getDetail_Header() throws com.mendix.core.CoreException
	{
		return getDetail_Header(getContext());
	}

	/**
	 * @param context
	 * @return value of Detail_Header
	 */
	public final testdraganddrop.proxies.Header getDetail_Header(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testdraganddrop.proxies.Header result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Detail_Header.toString());
		if (identifier != null)
			result = testdraganddrop.proxies.Header.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Detail_Header
	 * @param detail_header
	 */
	public final void setDetail_Header(testdraganddrop.proxies.Header detail_header)
	{
		setDetail_Header(getContext(), detail_header);
	}

	/**
	 * Set value of Detail_Header
	 * @param context
	 * @param detail_header
	 */
	public final void setDetail_Header(com.mendix.systemwideinterfaces.core.IContext context, testdraganddrop.proxies.Header detail_header)
	{
		if (detail_header == null)
			getMendixObject().setValue(context, MemberNames.Detail_Header.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Detail_Header.toString(), detail_header.getMendixObject().getId());
	}

	/**
	 * @return value of Detail_Item
	 */
	public final testdraganddrop.proxies.Item getDetail_Item() throws com.mendix.core.CoreException
	{
		return getDetail_Item(getContext());
	}

	/**
	 * @param context
	 * @return value of Detail_Item
	 */
	public final testdraganddrop.proxies.Item getDetail_Item(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testdraganddrop.proxies.Item result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Detail_Item.toString());
		if (identifier != null)
			result = testdraganddrop.proxies.Item.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Detail_Item
	 * @param detail_item
	 */
	public final void setDetail_Item(testdraganddrop.proxies.Item detail_item)
	{
		setDetail_Item(getContext(), detail_item);
	}

	/**
	 * Set value of Detail_Item
	 * @param context
	 * @param detail_item
	 */
	public final void setDetail_Item(com.mendix.systemwideinterfaces.core.IContext context, testdraganddrop.proxies.Item detail_item)
	{
		if (detail_item == null)
			getMendixObject().setValue(context, MemberNames.Detail_Item.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Detail_Item.toString(), detail_item.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return detailMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testdraganddrop.proxies.Detail that = (testdraganddrop.proxies.Detail) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "TestDragAndDrop.Detail";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
