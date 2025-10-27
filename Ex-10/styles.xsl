<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <head>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&amp;display=swap" rel="stylesheet"/>
        <style>
          body { font-family: 'Poppins', sans-serif; background-color: #121212; color: #ffffff; text-align: center; padding: 20px; }
          table { width: 80%; margin: auto; border-collapse: collapse; background: #1f1f1f; box-shadow: 0 0 10px #ff5e00; }
          th { background: #ff5e00; color: white; padding: 10px; }
          td { padding: 10px; border-bottom: 1px solid #2b2b2b; }
          h1 { color: #ff5e00; }
        </style>
      </head>
      <body>
        <h1>Garage91 Accessories</h1>
        <table>
          <tr><th>Name</th><th>Price</th><th>Stock</th></tr>
          <xsl:for-each select="garage91/accessory">
            <tr>
              <td><xsl:value-of select="name"/></td>
              <td><xsl:value-of select="price"/></td>
              <td><xsl:value-of select="stock"/></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>