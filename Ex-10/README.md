# Experiment 10 — XML - XSL/XSLT (Garage91 Theme)

## 🎯 Objective
To create XML with XSL attachment for presentation, access XML via HTML/JS, and via PHP.

## 🧩 Files
- `accessories.xml` — XML data with XSL attachment.
- `styles.xsl` — XSL stylesheet for presentable output.
- `access_html.html` — Accesses XML via HTML/JavaScript DOM.
- `access_php.php` — Accesses XML via PHP SimpleXML.
- `README.md` — Experiment details.

## ⚙️ Steps to Run
1. Open VS Code, place all files in the folder.
2. For XSL: Open `accessories.xml` in a browser (e.g., Chrome) to see styled output.
3. For HTML: Open `access_html.html` in a browser—JS loads/parses XML.
4. For PHP: Start XAMPP (Apache), place folder in `htdocs/Ex10_XML_XSL`, visit `http://localhost/Ex10_XML_XSL/access_php.php`.

## ✅ Deliverables Satisfied
- XML with XSL attached (`<?xml-stylesheet...?>`) for presentation (table view).
- XML accessed via HTML/JS (XMLHttpRequest to load and DOM to display).
- XML accessed via PHP (simplexml_load_file() to parse and echo data).
- Garage91 theme applied (dark #121212, orange #ff5e00, Poppins font).
- Minimal code, neat, uses PHP/XML/DOM, submission-ready.