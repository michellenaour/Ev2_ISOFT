package cl.ufro.dci.app.model;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

class RegistroPacienteTest {

    @Test
    void ingresarPacienteTest1() {
        Establecimiento establecimiento = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        RegistroPaciente registroPaciente = new RegistroPaciente();
        assertEquals(registroPaciente.ingresarPaciente(p1),true);
    }
    @Test
    void ingresarPacienteTest2() {
        Establecimiento establecimiento = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        assertEquals(registroPaciente.ingresarPaciente(123,"dv2",establecimiento,casos,antecedentes,"nombre2","ap",
                "sexo","fechanac","naci","po","dic","tel"),true);
    }
    @Test
    void ingresarPacienteTest3() {
        Establecimiento establecimiento = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        registroPaciente.ingresarPaciente(p1);
        assertEquals(registroPaciente.ingresarPaciente(123,"dv2",establecimiento,casos,antecedentes,"nombre2","ap",
                "sexo","fechanac","po","dic","tel","asd"),false);
    }

    @Test
    void buscarPacienteTest1() {
        Establecimiento establecimiento = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        registroPaciente.ingresarPaciente(p1);
        assertEquals(registroPaciente.buscarPaciente(123),p1);
    }
    @Test
    void buscarPacienteTest2() {
        Establecimiento establecimiento = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        assertEquals(registroPaciente.buscarPaciente(1),null);
    }
    @Test
    void buscarPacienteTest3() {
        Establecimiento establecimiento = new Establecimiento();
        Establecimiento establecimiento1 = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Caso> casos1 = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes1 = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        Paciente p2 = new Paciente(12345,"dv2",establecimiento1,casos1,antecedentes1,"nombre2","ap",
                "sexo","fechanac","po","dic","tel","asd");
        registroPaciente.ingresarPaciente(p1);
        registroPaciente.ingresarPaciente(p2);
        assertEquals(registroPaciente.buscarPaciente(p2),p2);
    }

    @Test
    void eliminarPacienteTest1() {
        Establecimiento establecimiento = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        registroPaciente.ingresarPaciente(p1);
        assertEquals(registroPaciente.eliminarPaciente(p1),true);
    }
    @Test
    void eliminarPacienteTest2() {
        Establecimiento establecimiento = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        registroPaciente.ingresarPaciente(p1);
        assertEquals(registroPaciente.eliminarPaciente(p1.getPacRut()),true);
    }
    @Test
    void eliminarPacienteTest3() {
        Establecimiento establecimiento = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        assertEquals(registroPaciente.eliminarPaciente(p1),false);
    }

    @Test
    void editarPacienteTest1() {
        Establecimiento establecimiento = new Establecimiento();
        Establecimiento establecimiento1 = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Caso> casos1 = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes1 = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        Paciente p2 = new Paciente(12345,"dv2",establecimiento1,casos1,antecedentes1,"nombre2","ap",
                "sexo","fechanac","po","dic","tel","asd");
        registroPaciente.ingresarPaciente(p1);
        assertEquals(registroPaciente.editarPaciente(12345,"dv2","nombre2","ap",
                "sexo","fechanac","po","dic","tel","asd"),null);
    }
    @Test
    void editarPacienteTest2() {
        Establecimiento establecimiento = new Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        registroPaciente.ingresarPaciente(p1);
        assertEquals(registroPaciente.editarPaciente(123,"dv2","nombre2","ap",
                "sexo","fechanac","po","dic","tel","asd"),p1);
    }
    @Test
    void editarPacienteTest3() {
        Establecimiento establecimiento = new Establecimiento();
        Establecimiento establecimiento1 = new  Establecimiento();
        List<Caso> casos = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Caso> casos1 = new List<Caso>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Caso> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Caso caso) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Caso> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Caso get(int index) {
                return null;
            }

            @Override
            public Caso set(int index, Caso element) {
                return null;
            }

            @Override
            public void add(int index, Caso element) {

            }

            @Override
            public Caso remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Caso> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Caso> listIterator(int index) {
                return null;
            }

            @Override
            public List<Caso> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        List<Antecedente> antecedentes1 = new List<Antecedente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Antecedente> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Antecedente antecedente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Antecedente> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Antecedente get(int index) {
                return null;
            }

            @Override
            public Antecedente set(int index, Antecedente element) {
                return null;
            }

            @Override
            public void add(int index, Antecedente element) {

            }

            @Override
            public Antecedente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Antecedente> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Antecedente> listIterator(int index) {
                return null;
            }

            @Override
            public List<Antecedente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        RegistroPaciente registroPaciente = new RegistroPaciente();
        Paciente p1 = new Paciente(123,"Dv1",establecimiento,casos,antecedentes,"nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234");
        registroPaciente.ingresarPaciente(p1);
        Paciente p2 = new Paciente(12345,"dv2",establecimiento1,casos1,antecedentes1,"nombre2","ap",
                "sexo","fechanac","po","dic","tel","asd");
        registroPaciente.ingresarPaciente(p2);
        assertEquals(registroPaciente.editarPaciente(12345,"Dv1","nombre1","apellido1","masculino","12/12/1980",
                "chilena","mapuche","direccion1","1234"),p2);
    }
}