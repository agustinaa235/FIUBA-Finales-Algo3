import criterio.ContenedorDeCriterios;
import criterio.PorCategoria;
import criterio.PorNombre;
import criterio.PorPrecio;
import exactitudCategoria.CategoriaAproximada;
import exactitudCategoria.CategoriaExacta;
import exactitudNombre.NombreAproximado;
import exactitudNombre.NombreExacto;
import org.junit.Assert;
import org.junit.Test;
import producto.IProducto;
import producto.Producto;

import java.util.Arrays;
import java.util.List;

public class BuscadorTest {


    @Test
    public void testBusquedaPorNombreExacto(){
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);
        ContenedorDeCriterios criterios = new ContenedorDeCriterios();
        criterios.agregarCriterio(new PorNombre("lapiz", new NombreExacto()));

        List<IProducto> resultados = buscador.buscar(criterios);
        Assert.assertEquals(Arrays.asList(lapiz), resultados);
    }
    @Test
    public void testBusquedaPorNombreAproximado(){
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);
        ContenedorDeCriterios criterios = new ContenedorDeCriterios();
        criterios.agregarCriterio(new PorNombre("pelo", new NombreAproximado()));

        List<IProducto> resultados = buscador.buscar(criterios);
        Assert.assertEquals(Arrays.asList(pelota, pelopincho), resultados);
    }
    @Test
    public void testBusquedaPorCategoriaAproximada() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);
        ContenedorDeCriterios criterios = new ContenedorDeCriterios();
        criterios.agregarCriterio(new PorCategoria("aire", new CategoriaAproximada()));
        List<IProducto> resultados = buscador.buscar(criterios);

        Assert.assertEquals(Arrays.asList(pelota, pelopincho), resultados);
    }
    @Test
    public void testBusquedaPorCategoriaExacta() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);
        ContenedorDeCriterios criterios = new ContenedorDeCriterios();
        criterios.agregarCriterio(new PorCategoria("deportes y aire libre", new CategoriaExacta()));
        List<IProducto> resultados = buscador.buscar(criterios);

        Assert.assertEquals(Arrays.asList(pelota, pelopincho), resultados);
    }
    @Test
    public void testBusquedaPorPrecio() {
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);
        ContenedorDeCriterios criterios = new ContenedorDeCriterios();
        criterios.agregarCriterio(new PorPrecio(30, 600));
        List<IProducto> resultados = buscador.buscar(criterios);

        Assert.assertEquals(Arrays.asList(pelota, lapiz), resultados);
    }

    @Test
    // considero la union de los criterios y no la interseccion.
    public void testBusquedaPorPrecioYCategoriaAproximada(){
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
        Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);
        ContenedorDeCriterios criterios = new ContenedorDeCriterios();
        criterios.agregarCriterio(new PorPrecio(30, 600));
        criterios.agregarCriterio(new PorNombre("lapiz", new NombreExacto()));
        List<IProducto> resultados = buscador.buscar(criterios);

        Assert.assertEquals(Arrays.asList( lapiz), resultados);
    }

    @Test

    public void testBusquedaPorPrecioConLimite1(){
        Producto pelota = new Producto("pelota", 500, "deportes y aire libre");
        Producto lapiz = new Producto("lapiz", 30, "articulos de libreria");
       Producto pelopincho = new Producto("pelopincho", 7000, "deportes y aire libre");
        Buscador buscador = new Buscador();
        buscador.agregarProducto(pelota);
        buscador.agregarProducto(lapiz);
        buscador.agregarProducto(pelopincho);
        ContenedorDeCriterios criterios = new ContenedorDeCriterios();
        criterios.agregarCriterio(new PorPrecio(30, 600));
        buscador.setLimite(1);
        List<IProducto> resultados = buscador.buscar(criterios);

        Assert.assertEquals(Arrays.asList(pelota), resultados);
    }



}
