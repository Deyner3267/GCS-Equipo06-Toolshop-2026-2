# Prueba automatizada: login de Toolshop (Practice Software Testing)
# Equipo 06 - Gestion y Calidad del Software
# Script de ejemplo para el conteo de LOC del Apartado 11

from playwright.sync_api import sync_playwright

URL = "https://practicesoftwaretesting.com"
USUARIO = "customer@practicesoftwaretesting.com"
CLAVE = "welcome01"


def login_valido():
    with sync_playwright() as p:
        navegador = p.chromium.launch(headless=True)
        pagina = navegador.new_page()
        pagina.goto(URL)
        pagina.click("a[data-test='nav-sign-in']")
        pagina.fill("input[data-test='email']", USUARIO)
        pagina.fill("input[data-test='password']", CLAVE)
        pagina.click("button[data-test='login-submit']")
        assert pagina.url == URL + "/account"
        navegador.close()


if __name__ == "__main__":
    login_valido()
