package at.jku.cis.iVolunteer.model.meta.core.clazz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.google.gson.JsonObject;

import at.jku.cis.iVolunteer.model.IVolunteerObject;
import at.jku.cis.iVolunteer.model.hash.IHashObject;
import at.jku.cis.iVolunteer.model.meta.core.property.definition.ClassProperty;

@Document
public class ClassDefinition extends IVolunteerObject implements IHashObject {

	private String parentId;
	private String configurationId;
	private String name;
	private List<ClassProperty<Object>> properties = new ArrayList<>();
	private ClassArchetype classArchetype;

	private boolean collector;
	private boolean writeProtected;

	private String imagePath;

	boolean root;
	boolean instantiable = true;

	private boolean visible;
	private int tabId;
	private int level;
	
	public ClassDefinition() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(String configurationId) {
		this.configurationId = configurationId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ClassProperty<Object>> getProperties() {
		return properties;
	}

	public void setProperties(List<ClassProperty<Object>> properties) {
		this.properties = properties;
	}
	/*
	 * public Boolean containsProperty(String name){ if (properties == null ||
	 * properties.size() == 0) return false; for (ClassProperty<Object> pi:
	 * properties) { if (pi.getName().equals(name)) return true; } return false; }
	 */

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public boolean isRoot() {
		return root;
	}

	public void setRoot(boolean root) {
		this.root = root;
	}

	public ClassArchetype getClassArchetype() {
		return classArchetype;
	}

	public void setClassArchetype(ClassArchetype classArchetype) {
		this.classArchetype = classArchetype;
	}

	public boolean isCollector() {
		return collector;
	}

	public void setCollector(boolean collector) {
		this.collector = collector;
	}

	public boolean isWriteProtected() {
		return writeProtected;
	}

	public void setWriteProtected(boolean writeProtected) {
		this.writeProtected = writeProtected;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public int getTabId() {
		return tabId;
	}

	public void setTabId(int tabId) {
		this.tabId = tabId;
	}

	public boolean isInstantiable() {
		return instantiable;
	}

	public void setInstantiable(boolean instantiable) {
		this.instantiable = instantiable;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ClassDefinition)) {
			return false;
		}
		return ((ClassDefinition) obj).id.equals(id);
	}

	@Override
	public String toHashObject() {
		JsonObject json = new JsonObject();
		json.addProperty("id", id);
		json.addProperty("name", name);
		json.addProperty("marketplaceId", marketplaceId);
		json.addProperty("parent", parentId);
		json.addProperty("properties", this.properties.hashCode());
		json.addProperty("timestamp", timestamp.toString());
		return json.toString();
	}

}
