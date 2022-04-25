package cl.desafiolatm.desafiociclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import cl.desafiolatm.desafiociclobike.adapter.CicloViaAdapter
import cl.desafiolatm.desafiociclobike.databinding.ActivityMainBinding
import cl.desafiolatm.desafiociclobike.modelo.CicloVia

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var lista: ArrayList<CicloVia>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        llenarLista()

        val listSpn = listOf<String>(
            "Mostrar Todo",
            "La Reina",
            "Las Condes",
            "Macul",
            "Ñuñoa",
            "Providencia"
        )
        val aaLista = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_dropdown_item, listSpn
        )

        with(binding) {

            val adapter = CicloViaAdapter(lista)
            val manager = LinearLayoutManager(applicationContext)
            rvLista.adapter = adapter
            rvLista.layoutManager = manager

            spnComuna.adapter = aaLista
            spnComuna.setSelection(0)
            spnComuna.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    if (position == 0) {
                        adapter.filtrar(lista)
                    }
                    if (position == 1) {
                        val lista1 = lista.filter { s -> s.comuna.contains(listSpn[1]) }
                        adapter.filtrar(lista1)
                    }
                    if (position == 2) {
                        val lista2 = lista.filter { s -> s.comuna.contains(listSpn[2]) }
                        adapter.filtrar(lista2)
                    }
                    if (position == 3) {
                        val lista3 = lista.filter { s -> s.comuna.contains(listSpn[3]) }
                        adapter.filtrar(lista3)
                    }
                    if (position == 4) {
                        val lista4 = lista.filter { s -> s.comuna.contains(listSpn[4]) }
                        adapter.filtrar(lista4)
                    }
                    if (position == 5) {
                        val lista5 = lista.filter { s -> s.comuna.contains(listSpn[5]) }
                        adapter.filtrar(lista5)
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(applicationContext, "Seleccione una opción", Toast.LENGTH_LONG)
                        .show()
                }
            }

            btnFiltrarTexto.setOnClickListener {
                if (tvFiltro.text.isNotEmpty()) {
                    val filtro1 = tvFiltro.text.toString()
                    val lista6 = lista.filter { s ->
                        s.nombre.lowercase()
                            .contains(filtro1.lowercase()) || s.comuna.lowercase()
                            .contains(filtro1.lowercase())
                    }
                    adapter.filtrar(lista6)
                } else {
                    Toast.makeText(
                        applicationContext, "Debe Ingresar un dato a evaluar", Toast.LENGTH_LONG
                    ).show()
                }
            }

            btnNombreCiclovia.setOnClickListener {
                if (tvFiltro.text.isNotEmpty()) {
                    val filtro2 = tvFiltro.text.toString()
                    val lista7 = lista.filter { s ->
                        s.nombre.lowercase()
                            .contains(filtro2.lowercase())
                    }
                    adapter.filtrar(lista7)
                } else {
                    Toast.makeText(
                        applicationContext, "Debe Ingresar un dato a evaluar", Toast.LENGTH_LONG
                    ).show()
                }
            }

            btnComuna.setOnClickListener {
                if (tvFiltro.text.isNotEmpty()) {
                    val filtro3 = tvFiltro.text.toString()
                    if (filtro3.toInt() > 0) {
                        val lista8 = lista.filter { s -> s.comuna.length > filtro3.toInt() }
                        adapter.filtrar(lista8)
                    } else {
                        Toast.makeText(
                            applicationContext, "Debe Ingresar un dato a evaluar", Toast.LENGTH_LONG
                        ).show()
                    }

                } else {
                    Toast.makeText(applicationContext, "Debe Ingresar un número", Toast.LENGTH_LONG)
                        .show()
                }
            }

            btnNumeroCiclovia.setOnClickListener {
                if (tvFiltro.text.isNotEmpty()) {
                    val filtro4 = tvFiltro.text.toString()
                    if (filtro4.toInt() > 0 || filtro4.toInt() <= 10) {
                        val lista9 = lista.filter { s -> s.nombre.contains(filtro4) }
                        adapter.filtrar(lista9)
                    } else {
                        Toast.makeText(
                            applicationContext, "Debe Ingresar un dato a evaluar", Toast.LENGTH_LONG
                        ).show()
                    }

                } else {
                    Toast.makeText(
                        applicationContext,
                        "Debe Ingresar un número entre 1 y 10",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

            btnSpinner.setOnClickListener {
                manager.reverseLayout = true
                manager.stackFromEnd = true
                rvLista.layoutManager
            }
        }
    }

    private fun llenarLista() {
        lista = ArrayList()
        lista.add(CicloVia("Ciclovía 1", "Las Condes"))
        lista.add(CicloVia("Ciclovía 2", "La Reina"))
        lista.add(CicloVia("Ciclovía 3", "Ñuñoa"))
        lista.add(CicloVia("Ciclovía 4", "Macul"))
        lista.add(CicloVia("Ciclovía 5", "Providencia"))
        lista.add(CicloVia("Ciclovía 6", "Las Condes"))
        lista.add(CicloVia("Ciclovía 7", "La Reina"))
        lista.add(CicloVia("Ciclovía 8", "Ñuñoa"))
        lista.add(CicloVia("Ciclovía 9", "Macul"))
        lista.add(CicloVia("Ciclovía 10", "Providencia"))
    }
}


